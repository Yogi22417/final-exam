class Main{
    public static void main(String[] args) {
        String kata = "Halo Dun Belajar Pemrograman";
        String[] split = kata.split(" ");
        String kataawal;

        for (int i = 0; i < split.length; i++) {
            try{
                if(split[i] == null || "".equals(split[i])){
                    throw new EmptyInputException();
                } if(split[i].length() > 30){
                    throw new WordToLongException();
                } else {
                    for (int a = 0; a < split.length; a++) {
                        if(split[i].length() < split[a].length()){
                            System.out.println(split[i]+ " ");
                        }
                    }
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}