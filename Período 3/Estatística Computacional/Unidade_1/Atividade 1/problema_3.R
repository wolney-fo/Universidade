library(readxl)
library(ggplot2)

data_problem3 <- read_excel("PROBLEMA_3.xlsx")

ggplot(data_problem3, aes(x = REGIÃO, y = POPULAÇÃO)) +
  geom_bar(stat = "identity")
