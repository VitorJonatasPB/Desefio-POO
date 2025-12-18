package br.com.dio.desafio.dominio;

import java.util.HashMap;
import java.util.Map;

public class NivelService {

    // Cache para armazenar XP total necessário para cada nível já calculado
    private static final Map<Integer, Integer> cacheXp = new HashMap<>();

    // Calcula o nível atual baseado no XP total do Dev
    public static int calcularNivel(double xpTotal) {
        int nivel = 1;
        int xpNecessario = xpParaNivel(nivel);

        // Enquanto o XP total for suficiente para alcançar o nível atual, sobe de nível
        while (xpTotal >= xpNecessario) {
            nivel++;
            xpNecessario = xpParaNivel(nivel);
        }

        return nivel;
    }

    // Calcula o XP total necessário para atingir um nível específico (com cache)
    private static int xpParaNivel(int nivel) {

        // Se já calculamos antes, retorna do cache
        if (cacheXp.containsKey(nivel)) {
            return cacheXp.get(nivel);
        }

        int xp;

        // Nível 1 é fixo
        if (nivel == 1) {
            xp = 50;
        } else {
            // Usa o valor do nível anterior já armazenado no cache
            int xpAnterior = xpParaNivel(nivel - 1);
            xp = xpAnterior + (50 * nivel);
        }

        // Armazena no cache antes de retornar
        cacheXp.put(nivel, xp);

        return xp;
    }
}

