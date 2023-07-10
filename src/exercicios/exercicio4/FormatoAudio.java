package exercicios.exercicio4;

public interface FormatoAudio {
    void abrir(String arquivo);
    void reproduzir();
    void pausar();
    void parar();
}

class MP3Player implements FormatoAudio {
    @Override
    public void abrir(String arquivo) {
        System.out.println("MP3Player abriu o arquivo: " + arquivo);
    }

    @Override
    public void reproduzir() {
        System.out.println("MP3Player está reproduzindo o arquivo de áudio.");
    }

    @Override
    public void pausar() {
        System.out.println("MP3Player pausou a reprodução do arquivo de áudio.");
    }

    @Override
    public void parar() {
        System.out.println("MP3Player parou a reprodução do arquivo de áudio.");
    }
}

class WAVPlayer implements FormatoAudio {
    @Override
    public void abrir(String arquivo) {
        System.out.println("WAVPlayer abriu o arquivo: " + arquivo);
    }

    @Override
    public void reproduzir() {
        System.out.println("WAVPlayer está reproduzindo o arquivo de áudio.");
    }

    @Override
    public void pausar() {
        System.out.println("WAVPlayer pausou a reprodução do arquivo de áudio.");
    }

    @Override
    public void parar() {
        System.out.println("WAVPlayer parou a reprodução do arquivo de áudio.");
    }
}

class MainFormatoAudio {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.abrir("musica.mp3");
        mp3Player.reproduzir();
        mp3Player.pausar();
        mp3Player.parar();

        WAVPlayer wavPlayer = new WAVPlayer();
        wavPlayer.abrir("som.wav");
        wavPlayer.reproduzir();
        wavPlayer.pausar();
        wavPlayer.parar();
    }
}
