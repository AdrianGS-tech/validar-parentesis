class Solution20 {
    public boolean isValid(String s) {
        char[] vector = new char[s.length()];
        int posicion = 0;

        for(char caracter : s.toCharArray()){
            switch(caracter){
                case '(':
                    vector[posicion++] = ')';
                    break;
                case '{':
                    vector[posicion++] = '}';
                    break;
                case '[':
                    vector[posicion++] = ']';
                    break;
            default:
                if(posicion == 0 || vector[--posicion] != caracter){
                    return false;
                }
                break;
            }
        }
        return posicion == 0;
    }
}