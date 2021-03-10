package com.jetbrains.java16.patternmatching;

/**
 * <div style="font-size: 110%;">Pattern matching for instanceof</div>
 * <ul>
 * <li>The old way</li>
 * <li>Scope of pattern variable (PatternMatching)</li>
 * <li>Simplify equal() method in class Monitor</li>
 * <li>process() in class ProdProject</li>
 * </ul>
 */

public class GettingStarted {
    private String str = "Initial Value";

    void outputValueInUppercase(Object obj) {
        if (!(obj instanceof String str)) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}
