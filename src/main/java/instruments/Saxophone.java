package instruments;

import behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay
{
  private SaxophoneType type;


  public Saxophone(InstrumentType instrumentType, String colour, String material, String brand,
    double buyingPrice, double sellingPrice, SaxophoneType type)
  {
    super(instrumentType, colour, material, brand, buyingPrice, sellingPrice);
    this.type = type;
  }

  public SaxophoneType getType()
  {
    return type;
  }

  public void setType(SaxophoneType type)
  {
    this.type = type;
  }

  @Override
  public String play()
  {
    return null;
  }

}
