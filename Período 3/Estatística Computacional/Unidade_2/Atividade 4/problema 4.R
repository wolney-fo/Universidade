library(ggplot2)


# 4.1
probabilidade <- dbinom(x=0:31,size=31,prob=0.56)
dias <- c(0:31)

E <- sum( dias*probabilidade )

media <- mean(probabilidade)
media

variancia <- sum( ((dias - E)^2)*probabilidade )
variancia

desvio_padrao <- sqrt(variancia)
desvio_padrao

# 4.2
tabela <- data.frame(dias, probabilidade)
tabela

# 4.3
ggplot(tabela, aes(x = dias, y = probabilidade)) +
  geom_bar(stat = "identity")

# 4.4
dbinom(x=20,size=31,prob=0.56)
