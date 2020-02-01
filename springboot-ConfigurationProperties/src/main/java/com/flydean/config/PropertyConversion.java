package com.flydean.config;

import com.flydean.pojo.Employee;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author wayne
 * @version PropertyConversion,  2020/2/1 12:47 下午
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "conversion")
public class PropertyConversion {

    private Duration timeInDefaultUnit;
    private Duration timeInNano;
    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeInDays;
    private DataSize sizeInDefaultUnit;
    private DataSize sizeInGB;
    @DataSizeUnit(DataUnit.TERABYTES)
    private DataSize sizeInTB;
    private Employee employee;
}
