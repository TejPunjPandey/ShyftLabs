import java.util.*;
public class Dsa {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        List<Integer> list=new ArrayList();
        String input = sc.nextLine();
        
        for(String num:input.split(" ")){
            list.add(Integer.valueOf(num));
        }
       
    
        int ans=0;
        while(true){
            if(list.get(ans)==-1){
                break;
            }
            ans++;
        }
        
        System.out.println("x: "+ans);
        
    }
}
