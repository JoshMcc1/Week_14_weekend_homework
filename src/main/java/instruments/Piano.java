package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay
{
  private PianoType type;

  public Piano(InstrumentType instrumentType, String colour, String material, String brand,
    double buyingPrice, double sellingPrice, PianoType type)
  {
    super(instrumentType, colour, material, brand, buyingPrice, sellingPrice);
    this.type = type;
  }

  public PianoType getType()
  {
    return type;
  }

  public void setType(PianoType type)
  {
    this.type = type;
  }

  @Override
  public String play()
  {
    return null;
  }
}
