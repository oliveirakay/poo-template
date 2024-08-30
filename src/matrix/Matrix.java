public class Matrix {

    private double[][] Matriz;

    Matrix(double[][] Matriz) {
        this.Matriz = new double[Matriz.length][Matriz[0].length];

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                this.Matriz[i][j] = Matriz[i][j];
            }
        }
    }

    public String toString() {
        String retorno = "";
        
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                retorno = retorno + String.format("%10.6f", this.Matriz[i][j]);
            }
            retorno = retorno + "\n";
        }
        return retorno;
    }
    
    public double[][] toArray() {
        double[][] resultado = new double[this.getRows()][this.getColumns()];

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultado[i][j] = this.Matriz[i][j];
            }
        }
        return resultado;
    }

    public int getRows() {
        return this.Matriz.length;
    }

    public int getColumns() {
        return this.Matriz[0].length;
    }

    public double getAt(int i, int j) {
        if (i < 0 || i >= getRows() || j < 0 || j >= getColumns()) {
            throw new IllegalArgumentException("");
        }
        return this.Matriz[i][j];
    }

    public Matrix plus(Matrix m) {
         if (this.getRows() != m.getRows() || this.getColumns() != m.getColumns()) {
            throw new IllegalArgumentException("");
        }
        
        double[][] resultado = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultado[i][j] = this.Matriz[i][j] + m.getAt(i, j);
            }
        }
        return (new Matrix(resultado));
    }

    public Matrix minus(Matrix m) {
         if (this.getRows() != m.getRows() || this.getColumns() != m.getColumns()){
            throw new IllegalArgumentException("");
        }
        
        double[][] resultado = new double[this.getRows()][this.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultado[i][j] = this.Matriz[i][j] - m.getAt(i, j);
            }
        }
        return (new Matrix(resultado));

    }

    public Matrix times(Matrix m) {
        if (this.getColumns() != m.getRows()) {
            throw new IllegalArgumentException("");
        }

        double[][] result = new double[this.getRows()][m.getColumns()];
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < m.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    result[i][j] += this.Matriz[i][k] * m.getAt(k, j);
                }
            }
        }
        return new Matrix(result);
    }

    public Matrix times(double escalar) {
        double[][] resultado = new double[this.getRows()][this.getColumns()];
        
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultado[i][j] = this.Matriz[i][j] * escalar;
            }
        }
        return (new Matrix(resultado));

    }

    public Matrix getTranspose() {
        double[][] resultado = new double[this.getColumns()][this.getRows()];
        
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultado[j][i] = this.Matriz[i][j];
            }
        }
        return (new Matrix(resultado));

    }

    public boolean isSquare() {
        if (this.getColumns() == this.getRows()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isSymmetric() {
        if (!this.isSquare()) {
            return false;
        }

        int size = this.getRows();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (this.Matriz[i][j] != this.Matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

}