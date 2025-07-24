def solution(picks, minerals):
    answer = 0
    mines = 0
    for i in picks:
        mines += i * 5
    #  한 곡갱이 당 5개씩 캘 수 있으므로 곡갱이 갯수로 광물 자르기
    minerals = minerals[:mines]
    
    # 한 곡갱이 당 캘수 있는 광물 확인
    minerals_count = [[0,0,0] for _ in range(len(minerals)// 5 + 1)]
    
    for i in range(len(minerals)):
        
        if minerals[i] == "diamond":
            minerals_count[i//5][0] += 1
        elif minerals[i] == "iron":
            minerals_count[i//5][1] += 1
        elif minerals[i] == "stone":
            minerals_count[i//5][2] += 1
            
    # 다이아가 가장 많은 순서로 sort 진행
    minerals_count.sort(key = lambda x : (x[0], x[1], x[2]), reverse = True)
    
    for i in minerals_count:
        
        dia = i[0]
        iron = i[1]
        stone = i[2]
        
        for j in range(len(picks)):
            if picks[j] > 0 and j == 0:
                answer += dia+iron+stone
                picks[j] -= 1
                break
            elif picks[j] > 0 and j == 1:
                answer += (dia*5) + iron + stone
                picks[j] -= 1
                break
            elif picks[j] > 0 and j == 2:
                answer += (dia*25) + (iron * 5) + stone
                picks[j] -= 1
                break
    
    return answer