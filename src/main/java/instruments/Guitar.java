package instruments;

import behaviours.IPlay;


public class Guitar extends Instrument implements IPlay
{
  private GuitarType type;
  private int noOfStrings;

  public Guitar(InstrumentType instrumentType, String colour, String material, String brand, double buyingPrice,
    double sellingPrice,  GuitarType type,
    int noOfStrings)
  {
    super(instrumentType, colour, material, brand, buyingPrice, sellingPrice);
    this.type = type;
    this.noOfStrings = noOfStrings;
  }

  public GuitarType getType()
  {
    return type;
  }

  public void setType(GuitarType type)
  {
    this.type = type;
  }

  public int getNoOfStrings()
  {
    return noOfStrings;
  }

  public void setNoOfStrings(int noOfStrings)
  {
    this.noOfStrings = noOfStrings;
  }

  @Override
  public String play()
  {
    return null;
  }


}
