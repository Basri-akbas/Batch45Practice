package Java_Lambda_proje;

public class Ogrenci {
	//bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    // toString methodu ile ogrenci bilgilerin yazdirin
    //��renci notlar�n� alt ve �st limitlere g�re s�ralayarak  yazdirin
    //��rencileri ya�lar�na g�re s�ralayark yazd�rin
    //��rencileri belirli bir ya�a ve cinsiyete g�re s�ralayarak listeleyin
    //��rencileri isimlerine g�re yazd�r�n
    //��rencileri soyisimlerine g�re yazd�r,n
    //��rencileri cinsiyetlerine g�re yazd�ran
    //listeyi yazd�r�rken i�inde veri var m� diye kontrol edin
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test ama�l� ��renci nesneleri olu�turun.
	
	private String ad;
	private String soyad;
	private int yas;
	private double diplomaNotu;
	private String cinsiyet;
	
	
	public Ogrenci() {
		
	}


	public Ogrenci(String ad, String soyad, int yas, double diplomaNotu, String cinsiyet) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.diplomaNotu = diplomaNotu;
		this.cinsiyet = cinsiyet;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public double getDiplomaNotu() {
		return diplomaNotu;
	}


	public void setDiplomaNotu(double diplomaNotu) {
		this.diplomaNotu = diplomaNotu;
	}


	public String getCinsiyet() {
		return cinsiyet;
	}


	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}


	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + ", diplomaNotu=" + diplomaNotu
				+ ", cinsiyet=" + cinsiyet + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
