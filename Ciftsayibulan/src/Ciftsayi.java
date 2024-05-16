public class Ciftsayi {
    public static void main(String[] args) {
        int [] list = {4,6,5,7,15,35,63,49,34,33,4,6};

        for (int i = 0; i< list.length; i++){
            for (int j=0; j< list.length; j++){
                if ((i != j) && (list[i]==list[j])) {

                    if (list[i]%2==0){
                        System.out.print(list[i]+", ");
                    }
                }
            }
        }
    }
}
