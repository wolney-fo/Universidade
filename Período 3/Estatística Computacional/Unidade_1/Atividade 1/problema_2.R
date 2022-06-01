library(readxl)
library(ggplot2)

data_problem2 <- read_excel("PROBLEMA_2.xlsx")

ggplot(data_problem2, aes(x = UF, y = POPULAÇÃO)) +
  geom_bar(stat = "identity")
