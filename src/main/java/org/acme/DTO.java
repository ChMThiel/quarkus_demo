
package org.acme;

import java.time.LocalTime;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
 * @since 06.12.2024
 */
public class DTO {

    @Schema(examples = "Hello World")
    String name;
    
    @Schema(examples = "13:45:30.123456789")
    LocalTime localTime;
    
    @Schema(examples = "13:45:30.123456789", nullable = true)
    LocalTime localTimeNullable;

    public String getName() {
        return name;
    }

    public DTO setName(String aName) {
        this.name = aName;
        return this;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public DTO setLocalTime(LocalTime aLocalTime) {
        this.localTime = aLocalTime;
        return this;
    }
    
    
}
