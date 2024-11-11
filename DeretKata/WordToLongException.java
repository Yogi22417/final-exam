class WordToLongException extends Exception{

    public WordToLongException(){
        super("Kata Tidak Boleh Lebih Dari 30 Huruf");
    }
}