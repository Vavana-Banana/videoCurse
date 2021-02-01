package video.curse.lection001;

public class numbers {
    //global int num = 5;
    private byte aByte;

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public void homework01(){
       // global int num = 5;
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 0_14;
        byte b4 = 0xc;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4  ) ;

    }
}
