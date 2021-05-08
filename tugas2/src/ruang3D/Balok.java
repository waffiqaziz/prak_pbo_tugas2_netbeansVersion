package ruang3D;

import bidang2D.PersegiPanjang;

public class Balok extends PersegiPanjang implements Ruang3D{
  private int panjang;
  private int lebar;
  private int tinggi;
  float luasPersegiPanjang1;
  float luasPersegiPanjang2;
  float luasPersegiPanjang3;
  float kelilingPersegiPanjang1;
  float kelilingPersegiPanjang2;
  float kelilingPersegiPanjang3;
  float volumeBalok;
  float luasBalok;
          
  public void setValue(int panjang, int lebar, int tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
    super.setValue(panjang, lebar);
    kelilingPersegiPanjang1 = getKelilingPersegiPanjang();
    super.setValue(panjang, tinggi);
    kelilingPersegiPanjang2 = getKelilingPersegiPanjang();
    super.setValue(tinggi, lebar);
    kelilingPersegiPanjang3 = getKelilingPersegiPanjang();

    hitungLuas();
    hitungVolume();
  }
  
  @Override
  public void hitungLuas() {
    luasPersegiPanjang1 = panjang * lebar;
    luasPersegiPanjang2 = panjang * tinggi;
    luasPersegiPanjang3 = tinggi * lebar;
    luasBalok = 2  * (luasPersegiPanjang1 + luasPersegiPanjang2 + luasPersegiPanjang3);
  }

  @Override
  public void hitungVolume() {
    volumeBalok = panjang * lebar * tinggi;
  }
  
  @Override
  public void display(){
    System.out.println("Keliling Persegi Panjang 1\t: " + kelilingPersegiPanjang1);
    System.out.println("Keliling Persegi Panjang 2\t: " + kelilingPersegiPanjang2);
    System.out.println("Keliling Persegi Panjang 3\t: " + kelilingPersegiPanjang3);
    System.out.println("Luas Persegi Panjang 1\t\t: " + luasPersegiPanjang1);
    System.out.println("Luas Persegi Panjang 2\t\t: " + luasPersegiPanjang2);
    System.out.println("Luas Persegi Panjang 3\t\t: " + luasPersegiPanjang3);
    System.out.println("Luas Permukaan Balok\t\t: " + luasBalok);
    System.out.println("Volume Balok\t\t\t: " + volumeBalok);
  }
  
  public float getLuas1(){
    return luasPersegiPanjang1;
  }
  public float getLuas2(){
    return luasPersegiPanjang2;
  }
  public float getLuas3(){
    return luasPersegiPanjang3;
  }
  public float getLuasPer(){
    return luasBalok;
  }
  public float getVol(){
    return volumeBalok;
  }
  public float getKel1(){
    return kelilingPersegiPanjang1;
  }
  public float getKel2(){
    return kelilingPersegiPanjang2;
  }
  public float getKel3(){
    return kelilingPersegiPanjang3;
  }
}
