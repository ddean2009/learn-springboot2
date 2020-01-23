package com.flydean.config;

import org.springframework.boot.autoconfigure.condition.ConditionMessage;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

import java.util.Arrays;

/**
 * @author wayne
 * @version HibernateCondition,  2020/1/22 11:25 下午
 */
public class HibernateCondition extends SpringBootCondition {

    private static String[] CLASS_NAMES
            = { "org.hibernate.ejb.HibernateEntityManager",
            "org.hibernate.jpa.HibernateEntityManager" };

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context,
                                            AnnotatedTypeMetadata metadata) {

        ConditionMessage.Builder message
                = ConditionMessage.forCondition("Hibernate");
        return Arrays.stream(CLASS_NAMES)
                .filter(className -> ClassUtils.isPresent(className, context.getClassLoader()))
                .map(className -> ConditionOutcome
                        .match(message.found("class")
                                .items(ConditionMessage.Style.NORMAL, className)))
                .findAny()
                .orElseGet(() -> ConditionOutcome
                        .noMatch(message.didNotFind("class", "classes")
                                .items(ConditionMessage.Style.NORMAL, Arrays.asList(CLASS_NAMES))));
    }
}
