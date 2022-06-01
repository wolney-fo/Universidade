library(ggplot2)

probabilidade <- dbinom(x=0:6,size=6,prob=0.59)
tvs_assinadas <- c(0,1,2,3,4,5,6)

tabela <- data.frame(tvs_assinadas, probabilidade)
tabela

ggplot(tabela, aes(x = tvs_assinadas, y = probabilidade)) +
  geom_bar(stat = "identity")
