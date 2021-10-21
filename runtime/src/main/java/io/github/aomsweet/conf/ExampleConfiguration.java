package io.github.aomsweet.conf;

import io.quarkus.runtime.annotations.ConfigItem;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author aomsweet
 */
@Data
@Accessors(chain = true)
public class ExampleConfiguration {

    /**
     * Host
     */
    @ConfigItem
    String host;

    /**
     * CacheKeyPrefix
     */
    @ConfigItem
    String cacheKeyPrefix;

    /**
     * ContractVersion
     */
    @ConfigItem(defaultValue = "350")
    Integer contractVersion;

    /**
     * DomainCode
     */
    @ConfigItem
    String domainCode;

    /**
     * AgentName
     */
    @ConfigItem
    String AgentName;

    /**
     * Password
     */
    @ConfigItem
    String password;

}
