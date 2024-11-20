import javax.swing.JOptionPane;

public class MiniEncuesta {
    public static void main(String[] args) {
        // Preguntar por las tres materias
        String materia1 = JOptionPane.showInputDialog("Ingresa el nombre de la primera materia:");
        String materia2 = JOptionPane.showInputDialog("Ingresa el nombre de la segunda materia:");
        String materia3 = JOptionPane.showInputDialog("Ingresa el nombre de la tercera materia:");

        // Preguntar cuál materia se ha dificultado más
        String[] opciones = {materia1, materia2, materia3};
        int dificultad = JOptionPane.showOptionDialog(null, 
                "¿Cuál de estas materias se te ha dificultado más?", 
                "Encuesta de Dificultad de Materias", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

        // Preguntar por qué se ha dificultado más
        String razon = JOptionPane.showInputDialog("¿Por qué se te ha dificultado más " + opciones[dificultad] + "?");

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, 
                "Materia más difícil: " + opciones[dificultad] + "\nRazón: " + razon, 
                "Resultado de la Encuesta", 
                JOptionPane.INFORMATION_MESSAGE);
    }
}