package bidang2D;

public class PersegiPanjang implements Bidang2D{
  int panjang;
  int lebar;
  float luasPersegiPanjang;
  float kelilingPersegiPanjang;
  
  public void setValue(int panjang, int lebar){
    this.panjang = panjang;
    this.lebar = lebar;
    hitungKeliling();
    hitungLuas();
  }

  @Override
  public void hitungLuas() {
    luasPersegiPanjang = panjang * lebar;
  }
  
  @Override
  public void hitungKeliling() {
    kelilingPersegiPanjang = 2 * (panjang + lebar);
  }
  
  public void display(){
    System.out.println("Keliling Persegi Panjag\t: " + kelilingPersegiPanjang);
    System.out.println("Luas Persegi Panjang\t: " + luasPersegiPanjang);
  }
  
  public float getKelilingPersegiPanjang(){
    return kelilingPersegiPanjang;
  }
}
