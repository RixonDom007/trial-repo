class Main{
    static void Pattern2(int n){
        int start =1;
    for(int i=0;i<n;i++){
        if(i%2==0){
            start =1;
        }
        else{
            start =0;
        }
        for(int j=0;j<=i;j++){
            System.out.print(start);
            start = 1-start;
        }
        System.out.println();
    }

}
    static void Pattern(int n) {

    for(int i=0;i<n;i++){
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>=0;i--){
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String[] args){
    int n = 5;
    //Pattern(n);
    Pattern2(n);
}
}