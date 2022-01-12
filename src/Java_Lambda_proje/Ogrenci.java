package Java_Lambda_proje;

public class Ogrenci {
	//bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    // toString methodu ile ogrenci bilgilerin yazdirin
    //Öðrenci notlarýný alt ve üst limitlere göre sýralayarak  yazdirin
    //Öðrencileri yaþlarýna göre sýralayark yazdýrin
    //Öðrencileri belirli bir yaþa ve cinsiyete göre sýralayarak listeleyin
    //Öðrencileri isimlerine göre yazdýrýn
    //Öðrencileri soyisimlerine göre yazdýr,n
    //Öðrencileri cinsiyetlerine göre yazdýran
    //listeyi yazdýrýrken içinde veri var mý diye kontrol edin
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test amaçlý Öðrenci nesneleri oluþturun.
	
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
