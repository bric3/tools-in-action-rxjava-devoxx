package com.github.devoxx.sandbox.slides;

/**
 * L'idée de ce slide est de construire opération par opération l'observable
 * pour montrer l'ensemble des opérateurs disponibles.
 */
// D code et parle. B peut avoir des points d'attentions
public class D_Operateurs {

    public static void main(String[] args) throws InterruptedException {

    }

    private static class Position {
        private final int pos;

        public Position(int pos) {
            this.pos = pos;
        }

        @Override
        public String toString() {
            return "Position ~> " + pos;
        }
    }
}
