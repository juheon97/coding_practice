def solution(friends, gifts):
    answer = 0
    n = len(friends)
    friend_dict = {}
    for i in range(n):
        friend_dict[friends[i]] = i
    
    table = [[0] * n for _ in range(n)]
    
    score = [0] * n
    
    for g in gifts:
        giver, taker = g.split()
        idx1, idx2 = friend_dict[giver], friend_dict[taker]
        score[idx1] += 1
        score[idx2] -= 1
        table[idx1][idx2] += 1
        
    result = [0] * n
    
    for i in range(n):
        for j in range(n):
            if i == j:
                continue
            # 주고받은 기록중 많은 사람이 다음달 선물
            if table[i][j] > table[j][i]:
                result[i] += 1
            # 주고받은 선물이 같거나 없으면 선물 지수를 비교하여 낮은쪽이 다음달에 선물 하나
            elif table[i][j] == table[j][i]:
                if score[i] > score[j]:
                    result[i] += 1
    answer = max(result)
    return answer