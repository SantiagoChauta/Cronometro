package Logica;
public class CronometroTemporizador {
    protected int tiempo;
   // protected int personas;
    protected int milesimas=0;
    protected int Centesimas=0;
    protected int Decimas=0;
    protected int Segundos=0;
    protected int Minutos=0;
    protected int Horas=0;
    
    public void gettiempo(int tiempo)
    {
        this.tiempo=tiempo;
    }
    public void gettopemilesimas(int milesimas)
    {
        int topemilesimas=milesimas;
    }
    public void gettopecentesimas(int centesimas)
    {
        int topeCentesimas=centesimas;
    }
    public void gettopedecimas(int decimas)
    {
        int topeDecimas=decimas;
    }
    public void gettopesegundos(int segundos)
    {
        int topeSegundos=segundos;
    }
    public void gettopeminutos(int minutos)
    {
        int topeMinutos=minutos;
    }
    public void gettopehoras(int horas)
    {
        int topeHoras=horas;
    }
    public void avanzar()
    {
        for(int i=0;i<=tiempo;i++)
        {
            milesimas++;
            System.out.println(Horas+":"+Minutos+":"+Segundos +":"+Decimas + ":" + Centesimas +":"+milesimas);
            if (milesimas==9)
            {
                Centesimas++;
                milesimas=0;
                System.out.println(Horas+":"+Minutos+":"+Segundos +":"+Decimas + ":" + Centesimas +":"+milesimas);
                if(Centesimas==9)
                {
                    Decimas++;
                    Centesimas=0;
                    System.out.println(Horas+":"+Minutos+":"+Segundos +":"+Decimas + ":" + Centesimas +":"+milesimas);
                    if(Decimas==9)
                    {
                        Segundos++;
                        Decimas=0;
                        System.out.println(Horas+":"+Minutos+":"+Segundos +":"+Decimas + ":" + Centesimas +":"+milesimas);
                        if(Segundos==59)
                        {
                            Minutos++;
                            Segundos=0;
                            System.out.println(Horas+":"+Minutos+":"+Segundos +":"+Decimas + ":" + Centesimas +":"+milesimas);
                            if(Minutos==59)
                            {
                                Horas++;
                                Minutos=0;
                                System.out.println(Horas+":"+Minutos+":"+Segundos +":"+Decimas + ":" + Centesimas +":"+milesimas);
                            }    
                        }
                    }
                }
            }
        }
    }
}
