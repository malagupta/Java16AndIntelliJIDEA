package com.jetbrains.java16.sealedtypes;

public interface Move {
}

class Athlete implements Move {}
interface Jump extends Move {}
record Player (String sports) implements Move {}
interface Kick extends Move {}

class Karate implements Kick {}
