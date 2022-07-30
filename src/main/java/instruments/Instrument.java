package instruments;

import behaviours.ISell;

public class Instrument implements ISell
{
  private InstrumentType instrumentType;
  private String colour;
  private String material;
  private String brand;
  private  double buyingPrice;
  private double sellingPrice;

  public Instrument(InstrumentType instrumentType, String colour, String material, String brand, double buyingPrice,
    double sellingPrice)
  {
    this.instrumentType = instrumentType;
    this.colour = colour;
    this.material = material;
    this.brand = brand;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

  public InstrumentType getInstrumentType()
  {
    return instrumentType;
  }

  public void setInstrumentType(InstrumentType instrumentType)
  {
    this.instrumentType = instrumentType;
  }

  public String getColour()
  {
    return colour;
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public String getMaterial()
  {
    return material;
  }

  public void setMaterial(String material)
  {
    this.material = material;
  }

  public String getBrand()
  {
    return brand;
  }

  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public double getBuyingPrice()
  {
    return buyingPrice;
  }

  public void setBuyingPrice(double buyingPrice)
  {
    this.buyingPrice = buyingPrice;
  }

  public double getSellingPrice()
  {
    return sellingPrice;
  }

  public void setSellingPrice(double sellingPrice)
  {
    this.sellingPrice = sellingPrice;
  }

  @Override
  public double calculateMarkup()
  {
    return sellingPrice - buyingPrice;
  }
}
