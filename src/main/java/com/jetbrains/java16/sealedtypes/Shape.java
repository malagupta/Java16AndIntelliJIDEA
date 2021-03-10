package com.jetbrains.java16.sealedtypes;

// 'permits' not required if subclasses are in the same source file

public sealed class Shape {
}

non-sealed class Circle extends Shape {}
non-sealed class Quadrilateral extends Shape {}
