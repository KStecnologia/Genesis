package caroco;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Data
{

    private int dia;
    private int mes;
    private int ano;

    final static public int DDMMAAAA = 1;
    final static public int AAAAMMDD = 2;
    final static public int DIASEMANA_DDMMAAAA = 3;

    public Data(int dia, int mes, int ano)
    {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1901;
        if (Data.estáCorreta(dia, mes, ano))
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    public String toString()
    {
        return this.obterDataFormatada(Data.DDMMAAAA);
    }
    
    

    public Data()
    {
        Calendar c = Calendar.getInstance();

        this.dia = c.get(Calendar.DAY_OF_MONTH);
        this.mes = c.get(Calendar.MONTH) + 1;
        this.ano = c.get(Calendar.YEAR);
    }

    public Data(String data)
    {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1901;

        String[] vet = data.split("/");

        if (vet.length == 3)
        {
            int d = Integer.parseInt(vet[0]);
            int m = Integer.parseInt(vet[1]);
            int a = Integer.parseInt(vet[2]);

            if (Data.estáCorreta(d, m, a))
            {
                this.dia = d;
                this.mes = m;
                this.ano = a;
            }
        }
    }

    public String obterDataFormatada(int formato)
    {
        DecimalFormat df2 = new DecimalFormat("00");
        DecimalFormat df4 = new DecimalFormat("0000");
        String retorno = null;
        if (formato == 1)
        {
            retorno = df2.format(dia) + "/" + df2.format(mes) + "/" + df4.format(ano);
        } else if (formato == 2)
        {
            retorno = df4.format(ano) + "/" + df2.format(mes) + "/" + df2.format(dia);
        } else if (formato == 3)
        {
            retorno = this.obterDiaDaSemana() + ", " + df2.format(dia) + " de " + this.obterExtensoDoMês() + " de " + this.ano;
        }
        return retorno;
    }

    public String obterDiaDaSemana()
    {
        String[] diasDaSemana =
        {
            "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
            "Sexta-feira", "Sábado", "Domingo"
        };
        int i = obterDiaDoSéculo() % 7;
        return diasDaSemana[i];
    }

    public String obterExtensoDoMês()
    {
        String[] mêses =
        {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"
        };
        return (mêses[this.mes - 1]);
    }

    public int obterDiasRestantesNoAno()
    {
        return this.obterDiferençaEmDias(new Data(31, 12, this.ano));
    }

    public int obterSemestre()
    {
        return (this.mes <= 6 ? 1 : 2);
    }

    public int obterBimestre()
    {
        return ((mes - 1) / 2) + 1;
    }

    public int obterTrimestre()
    {
        return ((mes - 1) / 3) + 1;
    }

    public int compareTo(Data dt)
    {
        int r = 0;
        if (this.obterDiaDoSéculo() < dt.obterDiaDoSéculo())
        {
            r = -1;
        } else if (this.obterDiaDoSéculo() > dt.obterDiaDoSéculo())
        {
            r = 1;
        }
        return r;
    }
    
    public int compareToMenor(Data dt)
    {
        int r = 0;
        if (this.obterDiaDoSéculo() < dt.obterDiaDoSéculo())
        {
            r = -1;
        } else if (this.obterDiaDoSéculo() > dt.obterDiaDoSéculo())
        {
            r = 1;
        }
        return r;
    }

    public int obterDiferençaEmDias(Data dt)
    {
        return Math.abs(this.obterDiaDoSéculo() - dt.obterDiaDoSéculo());
    }

    public int[] obterDiferença(Data dt)
    {
        Data dtMenor = this;
        Data dtMaior = dt;

        if (this.compareTo(dt) > 0)
        {
            dtMenor = dt;
            dtMaior = this;
        }

        int dias, meses, anos;
        dias = meses = anos = 0;

        
        //02/12/2016 - 21/11/2016
        if (dtMaior.compareTo(new Data(dtMenor.dia, dtMenor.mes, dtMaior.ano)) >= 0) // já fez aniversário este ano
        {
            //21/11/2015 - 02/12/2016
            anos = dtMaior.ano - dtMenor.ano;
            meses = dtMaior.mes - dtMenor.mes;
            dias = dtMaior.dia;
        }
        else // não fez aniversario este ano //21/11/2015 -- 02/02/2016
        {
            anos = dtMaior.ano - dtMenor.ano - 1;
            meses = 12 - dtMenor.mes + dtMaior.mes;
            dias = dtMaior.dia;
        }

        int[] vet =
        {
            anos, meses, dias
        };
        return vet;
    }

    public int obterSéculo()
    {
        int sec = (int) (this.ano / 100) + 1;
        if (this.ano % 100 == 0)
        {
            sec--;
        }
        return sec;
    }

    public String obterSigno()
    {
        String signo = "";
        if (this.mes == 1)
        {
            if (this.dia <= 20)
            {
                signo = "Capricórnio";
            } else
            {
                signo = "Aquário";
            }
        }
        if (this.mes == 2)
        {
            if (this.dia <= 19)
            {
                signo = "Aquário";
            } else
            {
                signo = "Peixe";
            }
        }
        if (this.mes == 3)
        {
            if (this.dia <= 20)
            {
                signo = "Peixe";
            } else
            {
                signo = "Áries";
            }
        }
        if (this.mes == 4)
        {
            if (this.dia <= 20)
            {
                signo = "Áries";
            } else
            {
                signo = "Touro";
            }
        }
        if (this.mes == 5)
        {
            if (this.dia <= 20)
            {
                signo = "Touro";
            } else
            {
                signo = "Gêmeos";
            }
        }
        if (this.mes == 6)
        {
            if (this.dia <= 20)
            {
                signo = "Gêmeos";
            } else
            {
                signo = "Câncer";
            }
        }
        if (this.mes == 7)
        {
            if (this.dia <= 21)
            {
                signo = "Câncer";
            } else
            {
                signo = "Leão";
            }
        }
        if (this.mes == 8)
        {
            if (this.dia <= 22)
            {
                signo = "Leão";
            } else
            {
                signo = "Virgem";
            }
        }
        if (this.mes == 9)
        {
            if (this.dia <= 22)
            {
                signo = "Virgem";
            } else
            {
                signo = "Libra";
            }
        }
        if (this.mes == 10)
        {
            if (this.dia <= 22)
            {
                signo = "Libra";
            } else
            {
                signo = "Escorpião";
            }
        }
        if (this.mes == 11)
        {
            if (this.dia <= 21)
            {
                signo = "Escorpião";
            } else
            {
                signo = "Sagitário";
            }
        }
        if (this.mes == 12)
        {
            if (this.dia <= 21)
            {
                signo = "Sagitário";
            } else
            {
                signo = "Capricórnio";
            }
        }
        return signo;
    }

    public int obterDiaNoAno()
    {
        int[] dias =
        {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        if (this.éBissexto())
        {
            dias[1] = 29;
        }
        int diasDecorridos = dia;
        for (int i = 0; i < mes - 1; i++)
        {
            diasDecorridos += dias[i];
        }
        return diasDecorridos;
    }

    public boolean éIgual(Data dt)
    {
        return (this.compareTo(dt) == 0);
    }

    public String estaçãoDoAno()
    {
        String aux = estaçãoDoAno(false);
        return aux;
    }

    public String estaçãoDoAno(boolean éNorte)
    {
        String estaçãoS = "Verão";
        String estaçãoN = "Inverno";
        if (this.compareTo(new Data(20, 3, ano)) > 0)
        {
            estaçãoS = "Outono";
            estaçãoN = "Primavera";
        }
        if (this.compareTo(new Data(20, 6, ano)) > 0)
        {
            estaçãoS = "Inverno";
            estaçãoN = "Verão";
        }
        if (this.compareTo(new Data(20, 9, ano)) > 0)
        {
            estaçãoS = "Primavera";
            estaçãoN = "Outono";
        }
        if (this.compareTo(new Data(20, 12, ano)) > 0)
        {
            estaçãoS = "Verão";
            estaçãoN = "Inverno";
        }

        if (éNorte)
        {
            return estaçãoN;
        }
        return estaçãoS;
    }

    public boolean éBissexto()
    {
        return (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0));
    }

    public String obterFaseDaLua()
    {
        int phase;          // Fase da Lua
        int cent;           // Número do século (1979 = 20)
        int epact;          // Idade da lua em 01 de janeiro
        int diy;            // Dia do ano
        int golden;         // Número de ouro da Lua
        int[] day_year =
        {
            -1, -1, 30, 58, 89, 119,
            150, 180, 211, 241, 272,
            303, 333
        };

        String nomeFase = "";

        if (mes < 0 || mes > 12)
        {
            mes = 0;     // Apenas no caso de
        }
        diy = dia + day_year[mes];                // Dia do ano
        if ((mes > 2) && this.éBissexto())
        {
            diy++;                                  // Leapyear fixup
        }
        cent = this.obterSéculo();                  // Número do século
        golden = (ano % 19) + 1;                   // Golden number
        epact = ((11 * golden) + 20 + (((8 * cent) + 5) / 25) - 5 - (((3 * cent) / 4) - 12)) % 30;
        if (epact <= 0)
        {
            epact += 30;                        // Age range is 1 .. 30
        }
        if ((epact == 25 && golden > 11) || epact == 24)
        {
            epact++;
        }

        // Calcular a fase, utilizando os números de mágica definidos acima.
        // Note-se que (fase e 7) é equivalente a (modificação de fase 8) e
        // É necessário em dois dias por ano (quando o algoritmo produz 8).
        phase = (((((diy + epact) * 6) + 11) % 177) / 22) & 7;

        String[] nomeFaseDaLua =
        {
            "Lua nova",
            "Lua crescente/ou crescente côncava",
            "Quarto Crescente",
            "Lua crescente convexa/ ou crescente gibosa",
            "Lua cheia",
            "Lua minguante convexa/ ou minguante gibosa",
            "Quarto Minguante",
            "Lua minguante/ ou minguante côncava"
        };

        return (nomeFaseDaLua[phase]);
    }

    public int obterDiasRestantesNoMês()
    {
        return (this.obterÚltimoDiaDoMês() - this.dia);
    }

    public int obterÚltimoDiaDoMês()
    {
        int[] dias =
        {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        if (this.éBissexto())
        {
            dias[1] = 29;
        }
        return dias[mes - 1];
    }

    public void avançarUmDia()
    {
        dia++;
        if (dia > obterÚltimoDiaDoMês())
        {
            dia = 1;
            mes++;
            if (mes > 12)
            {
                mes = 1;
                ano++;
            }
        }
    }

    public void retrocederUmDia()
    {
        this.dia--;
        if (this.dia <= 0) // significa que é preciso também voltar o mês
        {
            this.mes--;
            if (this.mes <= 0) // significa que é preciso voltar o ano
            {
                this.dia = 31;
                this.mes = 12;
                this.ano--;
            } else // seleciona o último dia do mês
            {
                this.dia = obterÚltimoDiaDoMês();
            }
        }
    }

    public void avançarDias(int dias)
    {
        for (int i = 0; i < dias; i++)
        {
            this.avançarUmDia();
        }
    }

    public void retrocederDias(int dias)
    {
        for (int i = 0; i < dias; i++)
        {
            this.retrocederUmDia();
        }
    }

    public int obterDia()
    {
        return dia;
    }

    public void definirDia(int dia)
    {
        if (estáCorreta(dia, this.mes, this.ano))
        {
            this.dia = dia;
        }
    }

    public int obterMes()
    {
        return mes;
    }

    public void definirMes(int mes)
    {
        if (estáCorreta(this.dia, mes, this.ano))
        {
            this.mes = mes;
        }
    }

    public void avancaMes(int mes){
        if (estáCorreta(dia, mes, ano)) {
            this.mes++;            
        }
    }
    
    public int obterAno()
    {
        return ano;
    }

    public void definirAno(int ano)
    {
        if (estáCorreta(this.dia, this.mes, ano))
        {
            this.ano = ano;
        }
    }

    public String obterDiaPorExtenso()
    {
        return "";
    }

    public int obterDiaDoSéculo()
    {
        //www.inf.ufrgs.br/~cabral/Dia_do_Seculo.html
        int diaDoSéculo = (ano - 1901) * 365 + (ano - 1901) / 4 + dia + (mes - 1)
                * 31 - ((mes * 4 + 23) / 10)
                * ((mes + 12) / 15) + ((4 - ano % 4) / 4)
                * ((mes + 12) / 15);
        return diaDoSéculo;
    }

    public boolean éFinalDeSemana()
    {
        return ("Sábado;Domingo".indexOf(this.obterDiaDaSemana()) >= 0);
    }

    public static boolean estáCorreta(String data)
    {
        String[] vet = data.split("/");
        boolean ok = false;
        if (vet.length == 3)
        {
            int d = Integer.parseInt(vet[0]);
            int m = Integer.parseInt(vet[1]);
            int a = Integer.parseInt(vet[2]);

            ok = estáCorreta(d,m,a);
        }
        return ok;
    }
    
    
    public static boolean estáCorreta(int dia, int mês, int ano)
    {
        boolean ok = false;

        int[] dias =
        {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (ano > 0)
        {
            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
            {
                dias[1] = 29;
            }
            if (mês >= 1 && mês <= 12)
            {
                if (dia >= 1 && dia <= dias[mês - 1])
                {
                    ok = true;
                }
            }
        }
        return (ok);
    }

}
