package com.example.multiplefields;

import java.util.Objects;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = DeviceParameterStoreForm.Builder.class)
public final class DeviceParameterStoreForm {

    @NotEmpty
    private final String guid;

    private final String idfa;

    private final String bundleId;

    private final String exactTargetId;

    private final String deviceTypeName;

    private final String osVersion;

    private final String iosType;

    private final Boolean marketingGdprEnabled;

    // Generated code begins here

    private DeviceParameterStoreForm(Builder builder) {
        this.guid = builder.guid;
        this.idfa = builder.idfa;
        this.bundleId = builder.bundleId;
        this.exactTargetId = builder.exactTargetId;
        this.deviceTypeName = builder.deviceTypeName;
        this.osVersion = builder.osVersion;
        this.iosType = builder.iosType;
        this.marketingGdprEnabled = builder.marketingGdprEnabled;
    }

    public String getGuid() {
        return guid;
    }

    public String getIdfa() {
        return idfa;
    }

    public String getBundleId() {
        return bundleId;
    }

    public String getExactTargetId() {
        return exactTargetId;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getIosType() {
        return iosType;
    }

    public Boolean isMarketingGdprEnabled() {
        return marketingGdprEnabled;
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof DeviceParameterStoreForm)) {
            return false;
        }
        DeviceParameterStoreForm castOther = (DeviceParameterStoreForm) other;
        return Objects.equals(guid, castOther.guid) && Objects.equals(idfa, castOther.idfa) && Objects.equals(bundleId, castOther.bundleId)
                && Objects.equals(exactTargetId, castOther.exactTargetId) && Objects.equals(deviceTypeName, castOther.deviceTypeName)
                && Objects.equals(osVersion, castOther.osVersion) && Objects.equals(iosType, castOther.iosType)
                && Objects.equals(marketingGdprEnabled, castOther.marketingGdprEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, idfa, bundleId, exactTargetId, deviceTypeName, osVersion, iosType, marketingGdprEnabled);
    }

    @Override
    public String toString() {
        return "DeviceParameterStoreForm [guid=" + guid + ", idfa=" + idfa + ", bundleId=" + bundleId + ", exactTargetId=" + exactTargetId + ", name="
                + deviceTypeName + ", marketingGdprEnabled=" + marketingGdprEnabled + ", osVersion=" + osVersion + ", iosType=" + iosType + "]";
    }

    /**
     * Creates builder to build {@link DeviceParameterStoreForm}.
     *
     * @return created builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder to build {@link DeviceParameterStoreForm}.
     */
    public static final class Builder {
        private String guid;
        private String idfa;
        private String bundleId;
        private String exactTargetId;
        private String deviceTypeName;
        private String osVersion;
        private String iosType;
        @JsonProperty("marketingGdprEnabled")
        @JsonAlias("marketing3rdPartyTrackingEnabled")
        private Boolean marketingGdprEnabled;

        private Builder() {
        }

        public Builder withGuid(String guid) {
            this.guid = guid;
            return this;
        }

        public Builder withIdfa(String idfa) {
            this.idfa = idfa;
            return this;
        }

        public Builder withBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder withExactTargetId(String exactTargetId) {
            this.exactTargetId = exactTargetId;
            return this;
        }

        public Builder withDeviceTypeName(String deviceTypeName) {
            this.deviceTypeName = deviceTypeName;
            return this;
        }

        public Builder withOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder withIosType(String iosType) {
            this.iosType = iosType;
            return this;
        }

        public Builder withMarketingGdprEnabled(final Boolean marketingGdprEnabled) {
            this.marketingGdprEnabled = marketingGdprEnabled;
            return this;
        }

        public DeviceParameterStoreForm build() {
            return new DeviceParameterStoreForm(this);
        }
    }
    // Generated code ends here
}