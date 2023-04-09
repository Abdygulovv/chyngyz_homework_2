public class Main {
    public static void main(String[] args) {
        System.out.println(createObjekt("Computer"));
        System.out.println(createObjekt("Tv"));
        System.out.println(createObjekt("Telephone"));


    }

    private static Technique createObjekt(String className) {

        switch (className) {
            case "Computer":
                Computer computer = new Computer("Macbook ", "core i5", 95, 8);
                computer.print();
                return computer;
            case "Tv":
                Tv tv = new Tv("Samsung", 32, new int[]{3840, 2160});
                tv.print();
                return tv;
            case "Telephone":
                Telephone telephone = new Telephone("Redmi", 50);
                telephone.print();
                return telephone;


        }


        return null;
    }




}