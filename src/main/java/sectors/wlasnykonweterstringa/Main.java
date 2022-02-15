package sectors.wlasnykonweterstringa;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String helper = "0";
        int x=0;
        boolean isDot=false;
        while((helper.charAt(x)!='.')&&(x!=helper.length()-1)){
        x++;
        if(helper.charAt(x)=='.')isDot = true;
        }

        if(!isDot){
            helper = helper + ".00";
        }

        int z=x;

        if((z+2)<helper.length()){
        String helper2 = "";
        for(int y=0; y<=z+2; y++){
            helper2 = helper2 + helper.charAt(y);
        }
        helper = helper2;
        }else if((z+2)==helper.length()){
            helper = helper + "0";
        }

        DecimalFormat df = new DecimalFormat("###,###,###.00 z?");

        double moneyAdd=0;
        try{
            moneyAdd = Double.parseDouble(helper);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        System.out.println("Money add: " + df.format(moneyAdd));
    }
}
