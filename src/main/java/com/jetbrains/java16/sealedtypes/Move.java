package com.jetbrains.java16.sealedtypes;

public interface Move {
}

class Athlete implements Move {}
interface Jump extends Move {}
interface Kick extends Move {}

class Karate implements Kick {}
