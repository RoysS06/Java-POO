package ejercicioVideojuego;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {

    public static void main(String[] args) {

        //PUNTO 2
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        VideoJuego video1 = new VideoJuego();
        video1.setCodigo(123);
        video1.setTitulo("Banjo Kazooie");
        video1.setConsola("Nintendo 64");
        video1.setCantJugadores(4);
        video1.setCategoria("Plataforma");

        VideoJuego video2 = new VideoJuego();
        video2.setCodigo(456);
        video2.setTitulo("Mario Party 3");
        video2.setConsola("Nintendo 64");
        video2.setCantJugadores(4);
        video2.setCategoria("Plataforma");

        VideoJuego video3 = new VideoJuego();
        video3.setCodigo(789);
        video3.setTitulo("Age of Empire II");
        video3.setConsola("PC");
        video3.setCantJugadores(1);
        video3.setCategoria("Estrategia");

        VideoJuego video4 = new VideoJuego();
        video4.setCodigo(147);
        video4.setTitulo("Counter Strike 1.6");
        video4.setConsola("PC");
        video4.setCantJugadores(1);
        video4.setCategoria("Shooter");

        VideoJuego video5 = new VideoJuego();
        video5.setCodigo(369);
        video5.setTitulo("Mario Kart 64");
        video5.setConsola("Nintendo 64");
        video5.setCantJugadores(2);
        video5.setCategoria("Plataforma");

        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);

        //PUNTO 3 - RECORRIDO

        for (VideoJuego video: listaVideojuegos){
            System.out.println("Titulo: " + video.getTitulo() +
                    " Consola: " + video.getConsola() +
                    " Cant jugadores: " + video.getCantJugadores());
        }


        System.out.println("----------------------");
        //PUNTO 4 - CAMBIO DE NOMBRE Y JUGADORES

        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(1);

        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);


        //PUNTO 5
        for (VideoJuego video : listaVideojuegos){
            if (video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }

    }
}
