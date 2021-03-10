package com.jetbrains.java16.sealedtypes;

public sealed interface Move permits Athlete, Jump, Kick {
}

final class Athlete implements Move {}
non-sealed interface Jump extends Move {}
sealed interface Kick extends Move permits Karate {}

final class Karate implements Kick {}
