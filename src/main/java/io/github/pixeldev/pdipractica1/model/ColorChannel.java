package io.github.pixeldev.pdipractica1.model;

import java.awt.*;

public enum ColorChannel {
  ORIGINAL(0),
  RED(1),
  GREEN(2),
  BLUE(3);

  private final int value;

  ColorChannel(final int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Color getColor() {
    switch (this) {
      case RED -> {
        return Color.RED;
      }
      case GREEN -> {
        return Color.GREEN;
      }
      case BLUE -> {
        return Color.BLUE;
      }
      default -> {
        return Color.BLACK;
      }
    }
  }

  public static ColorChannel fromValue(final int value) {
    for (final ColorChannel channel : ColorChannel.values()) {
      if (channel.getValue() == value) {
        return channel;
      }
    }
    return null;
  }
}
