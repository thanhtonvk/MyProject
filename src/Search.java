public class Search {
    public static void main(String[] args) {
        String a = "Tôi bị đau bụng";
        String ex = "bụng";
        boolean kt = false;
        for (int i = 0; i < a.split(" ").length; i++) {
            if (a.split(" ")[i].equals(ex)) {
                System.out.println("bạn bị đau bụng ");
                kt = true;
            }

        }
        if(kt==false) System.out.println("nothing");
    }
}

