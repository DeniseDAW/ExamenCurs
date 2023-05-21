/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.Arrays;

/**
 *
 * @author Eduardo Silvestre
 */
public class CreadorDeNoms {

    private static final String[] noms = {
        "ADRIÁN", "AGUSTÍN", "AITANA", "AITOR", "ALBA", "ALBERT", "ALBERTO", "ALEJANDRO",
        "ÁLEX", "ALFONSO", "ALFREDO", "ALICIA", "ÁLVARO", "AMPARO", "ANA",
        "ANA BELÉN", "ANA ISABEL", "ANA MARÍA", "ANDREA", "ANDRÉS", "ÁNGEL",
        "ÁNGELA", "ÁNGELES", "ANTONIA", "ANTONIO", "AURORA", "BEATRIZ", "BORJA", "CAMILO",
        "CARLA", "CARLOS", "CARMEN", "CAROLINA", "CATALINA", "CELIA", "CÉSAR",
        "CLAUDIA", "CONCEPCIÓN", "CONSUELO", "CRISTIAN", "CRISTINA", "DANIEL",
        "DANIELA", "DAVID", "DIEGO", "DOLORES", "DOMINGO", "EDITH", "EDUARDO", "ELENA",
        "ELISA", "EMILIA", "EMILIO", "ENCARNACIÓN", "ENRIQUE", "ESPERANZA",
        "ESTHER", "EVA", "EVA MARÍA", "FELIPE", "FERNANDO", "FRANCISCA",
        "FRANCISCO", "FRANCISCO JAVIER", "FRANCISCO JOSÉ", "FÉLIX", "GABRIEL",
        "GLÒRIA", "GONZALO", "GREGORIO", "GUILLERMO", "HUGO", "HÉCTOR", "IGNACIO",
        "IKER", "INMACULADA", "INÉS", "IRENE", "ISABEL", "ISMAEL", "IVÁN", "JAIME",
        "JAVIER", "JESSICA", "JESÚS", "JOAN", "JOAQUÍN", "JORDI", "JORGE", "JOSEFA",
        "JOSEFINA", "JOSEP", "JOSÉ", "JOSÉ ANTONIO", "JOSÉ CARLOS", "JOSÉ FRANCISCO",
        "JOSÉ IGNACIO", "JOSÉ LUIS", "JOSÉ MANUEL", "JOSÉ MARÍA", "JOSÉ MIGUEL",
        "JOSÉ RAMÓN", "JOSÉ ÁNGEL", "JUAN", "JUAN ANTONIO", "JUAN CARLOS",
        "JUAN FRANCISCO", "JUAN JOSÉ", "JUAN LUIS", "JUAN MANUEL", "JUANA", "JULIA",
        "JULIO", "JULIÁN", "LAURA", "LIDIA", "LORENA", "LORENZO", "LUCÍA", "LUIS",
        "LUIS MIGUEL", "LUISA", "MANUEL", "MANUELA", "MARC", "MARCOS", "MARGARITA",
        "MARÍA", "MARÍA ANTONIA", "MARÍA CARMEN", "MARÍA CONCEPCIÓN", "MARÍA CRISTINA",
        "MARÍA DOLORES", "MARÍA ELENA", "MARÍA ISABEL", "MARÍA JESÚS", "MARÍA JOSEFA",
        "MARÍA JOSÉ", "MARÍA LUISA", "MARÍA MAR", "MARÍA MERCEDES", "MARÍA NIEVES",
        "MARÍA PILAR", "MARÍA ROSA", "MARÍA ROSARIO", "MARÍA SOLEDAD", "MARÍA TERESA",
        "MARÍA VICTORIA", "MARÍA ÁNGELES", "MARIANO", "MARINA", "MARIO", "MARTA",
        "MARTIN", "MERCEDES", "MIGUEL", "MIGUEL ÁNGEL", "MILAGROS", "MIRIAM",
        "MOHAMED", "MONTSERRAT", "MÓNICA", "NATALIA", "NEREA", "NICOLÁS", "NOELIA",
        "NURIA", "OLGA", "OLGA", "ÓSCAR", "PABLO", "PATRICIA", "PAULA", "PEDRO",
        "PILAR", "RAFAEL", "RAMÓN", "RAQUEL", "RAÚL", "REBECA", "REYES", "RICARDO",
        "ROBERTO", "ROCÍO", "RODRIGO", "ROSA", "ROSA MARÍA", "ROSARIO", "RUBÉN",
        "SALVADOR", "SAMUEL", "SANDRA", "SANTIAGO", "SARA", "SEBASTIÁN", "SERGIO",
        "SERRAT", "SILVIA", "SOFÍA", "SONIA", "SUSANA", "TERESA", "TOMAS", "VERÓNICA",
        "VICENTE", "VICTORIA", "VIOLETA", "VÍCTOR", "VÍCTOR MANUEL", "XAVIER",
        "YOLANDA"

    };

    private static final String[] cognoms = {
        "AGUILAR", "AGUIRRE", "AIZPEOLEA", "ALAMÀ", "ALONSO", "ÁLVAREZ", "ARANDA",
        "ARIAS", "ARRIBAS", "ARROYO", "ÁVALOS", "BAILÉN", "BAQUERO", "BARRA", "BAS",
        "BEAUREGARD", "BELINCHÓN", "BENÍTEZ", "BERNAL", "BLANCO", "BONET", "BRAVO",
        "CABALLERO", "CABRERA", "CALVO", "CAMACHO", "CAMPOS", "CANO", "CARMONA",
        "CARRASCO", "CASTILLO", "CASTRO", "CERVERA", "CLEMENTE", "CORDERO", "CORTÉS",
        "CRESPO", "CRUZ", "CUESTA", "DE BLAS", "DELGADO", "DÍAZ", "DIEZ", "DOMÍNGUEZ",
        "DONCEL", "DURAN", "ESTEBAN", "FERNÁNDEZ", "FERRER", "FLORES", "FONSECA",
        "FRANCÉS", "FUENTES", "GALLARDO", "GALLEGO", "GALÁN", "GARCÍA", "GARRIDO",
        "GIL", "GIMÉNEZ", "GÓMEZ", "GONZÁLEZ", "GORGUES", "GRACIA", "GUERRERO",
        "GUTIÉRREZ", "GÓMEZ", "GÜELL", "HERNÁNDEZ", "HERRERA", "HERRERO", "HIDALGO",
        "IBÁÑEZ", "IGLESIAS", "JIMÉNEZ", "LAHOZ", "LEÓN", "LINDE", "LLANERAS",
        "LLANOS", "LORENZO", "LOZANO", "LÓPEZ", "LUCAS", "MARTORELL", "MARTÍN",
        "MARTÍNEZ", "MARÍN", "MAÑANA", "MEDINA", "MEJÍA", "MILLÁN", "MOLINA", "MOLLÀ",
        "MONTERO", "MORA", "MORALES", "MORATÓ", "MORENO", "MOYA", "MOÑINO", "MUÑOZ",
        "MÁRQUEZ", "MÉNDEZ", "NADAL", "NARANJO", "NAVARRO", "NIETO", "NÚÑEZ",
        "ORMAZABAL", "ORTEGA", "ORTIZ", "PALLARÉS", "PARRA", "PASCUAL", "PASTOR",
        "PELÁEZ", "PEÑA", "POLO", "PRIETO", "PÉREZ", "RAMOS", "RAMÍREZ", "REBOLLO",
        "REYES", "RIOJA", "RIVAS", "RODRÍGUEZ", "ROIG", "ROJAS", "ROJO", "ROMERO",
        "ROMÁN", "RUBIO", "RUIZ", "SÁEZ", "SAINZ", "SAIZ", "SÁNCHEZ", "SANGUINO",
        "SANTANA", "SANTIAGO", "SANTOS", "SANZ", "SEMPER", "SERRANO", "SOLER", "SORNI",
        "SOTO", "SUÁREZ", "TARÍN", "TATAY", "TORRES", "TORRIJO", "VALERO", "VALLEJO",
        "VALVERDE", "VARGAS", "VÁZQUEZ", "VEGA", "VELASCO", "VERCHER", "VICENTE", 
        "VIDAL", "VILLENA", "ZAFRA", "ZURRIAGA"

    };

    /**
     * torna un cognom. COGNOM1 COGNOM2.
     *
     * @return la cadena amb el cognom
     */
    public static String getCognoms() {
        return cognoms[(int) (Math.random() * cognoms.length)] + " "
                + cognoms[(int) (Math.random() * cognoms.length)];
    }

    /**
     * torna un nom. NOM.
     *
     * @return la cadena amb el nom
     */
    public static String getNom() {
        return noms[(int) (Math.random() * noms.length)];
    }

    /**
     * torna un nom complet. NOM COGNOM1 COGNOM2.
     *
     * @return la cadena amb el nom complet
     */
    public static String getUnNomComplet() {
        return getNom() + " " + getCognoms();
    }


}
