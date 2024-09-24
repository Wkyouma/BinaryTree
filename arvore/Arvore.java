public class Arvore {
    private Node raiz;
    public void inserir(int valor){
        raiz = inserirr(raiz, valor);
    }

    
    private Node inserirr(Node raiz, int valor){
        if(raiz == null){
            raiz = new Node(valor);
            return raiz;
        }
        if(valor<raiz.info){
            raiz.esquerda = inserirr(raiz.esquerda, valor);
        }else if(valor>raiz.info){
            raiz.direita = inserirr(raiz.direita, valor);
        }
        return raiz;
    }

    public void InOrdem(){
        InOrdemm(raiz);

    }

    private void InOrdemm(Node raiz){
        if(raiz != null){{
            InOrdemm(raiz.esquerda);
            System.out.print(raiz.info + " ");
            InOrdemm(raiz.direita);
        }}}

    public void PreOrdem(){
        PreOrdemm(raiz);
    }
    private void PreOrdemm(Node raiz){
        if(raiz != null){
            System.out.print(raiz.info + " ");
            PreOrdemm(raiz.esquerda);
            PreOrdemm(raiz.direita);
        }}
    public void PosOrdem(){
        PosOrdemm(raiz);
    }
    private void PosOrdemm(Node raiz){
        if(raiz != null){
            PosOrdemm(raiz.esquerda);
            PosOrdemm(raiz.direita);
            System.out.print(raiz.info + " ");
        }}
    

        public static void main(String[] args){
            Arvore arvore = new Arvore();
            arvore.inserir(14);
            arvore.inserir(15);
            arvore.inserir(4);
            arvore.inserir(9);
            arvore.inserir(7);
            arvore.inserir(18);
            arvore.inserir(3);
            arvore.inserir(5);
            arvore.inserir(16);
            arvore.inserir(20);
            arvore.inserir(17);
            arvore.inserir(9);
            arvore.inserir(5);
            System.out.println("Arvore em Ordem:");
            arvore.InOrdem();
            System.out.println(); 
            System.out.println("Arvore em PreOrdem:");
            arvore.PreOrdem();
            System.out.println(); 
            System.out.println("Arvore em PosOrdem:");
            arvore.PosOrdem();
            
        }
    }

    