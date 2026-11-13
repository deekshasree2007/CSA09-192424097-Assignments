# Q5 – Analysis and Observations

## 1. Aim

To understand Generics, Comparable and Comparator and implement a generic leaderboard with custom ranking.

## 2. Observations

- Generics allow reusable and type-safe classes.
- Leaderboard<T> stores objects using a generic type parameter.
- Comparator provides custom sorting rules.
- Teams with more points receive higher rankings.
- If points are equal, goal difference is considered.
- If both points and goal difference are equal, team names are sorted alphabetically.

## 3. Ranking Analysis

| Team | Points | Goal Difference | Rank |
|---|---:|---:|---:|
| Eagles | 9 | 6 | 1 |
| Bisons | 9 | 4 | 2 |
| Panthers | 9 | 4 | 3 |
| Cobras | 6 | 1 | 4 |

## 4. Design Decision

Comparator is suitable for this leaderboard because the application requires multiple ranking conditions. The generic class makes the leaderboard reusable for different object types.

## 5. Conclusion

The experiment demonstrates how Generics improve code reusability and how Comparator supports flexible object ranking.