package com.cybertek.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
/*Need to create constructor. Because it is final and static.
Status(String value) {
        this.value = value;
    }
 */
@AllArgsConstructor
public enum Status {

    OPEN("Open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");
    private final String value;

}
