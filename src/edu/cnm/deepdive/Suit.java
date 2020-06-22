package edu.cnm.deepdive;

/**
 * Encapsulate the suits of standard playing cards. each instance can return (using the {@link
 * #symbol()} method) the Unicode symbol for that suit. method) the Unicode symbol for that suit.
 */
public enum Suit {

  CLUBS(Color.BLACK),
  DIAMONDS(Color.RED),
  HEARTS(Color.RED),
  SPADES(Color.BLACK);

  private final Color color;

  private Suit(Color color) {
    this.color = color;
  }

  /**
   * Return the Unicode symbol for the current instance.
   *
   * @return One of the four symbols: ♠, ♡, ♢, ♣.
   */
  public char symbol() {
    switch (this) {
      case CLUBS:
        return '\u2663';
      case DIAMONDS:
        return '\u2662';
      case HEARTS:
        return '\u2661';
      case SPADES:
        return '\u2660';
      default:
        return 0;
    }
  }

  public Color getColor() {
    return color;
  }
}
