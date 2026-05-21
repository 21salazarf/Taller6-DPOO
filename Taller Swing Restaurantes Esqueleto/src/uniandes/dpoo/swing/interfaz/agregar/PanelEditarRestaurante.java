package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	setLayout(new GridLayout(3, 2, 5, 5));

        // 1. Crea el campo para el nombre con su etiqueta
        JLabel labNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField();

        // 2. Crea el selector para la calificación (opciones del 1 al 5)
        JLabel labCalificacion = new JLabel("Calificación: ");
        cbbCalificacion = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});

        // 3. Crea el selector para indicar si ya ha sido visitado o no
        JLabel labVisitado = new JLabel("¿Visitado?: ");
        cbbVisitado = new JComboBox<>(new String[]{"Sí", "No"});

        // Agrega todos los elementos al panel en orden (Fila por fila, de izquierda a derecha)
        add(labNombre);
        add(txtNombre);
        add(labCalificacion);
        add(cbbCalificacion);
        add(labVisitado);
        add(cbbVisitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
    	String seleccionado = (String) cbbVisitado.getSelectedItem();
        return "Sí".equals(seleccionado);
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
    	return txtNombre.getText() != null ? txtNombre.getText().trim() : "";
    }
}
