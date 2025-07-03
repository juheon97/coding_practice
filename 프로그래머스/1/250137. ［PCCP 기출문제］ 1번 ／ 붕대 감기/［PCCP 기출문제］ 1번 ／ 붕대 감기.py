def solution(bandage, health, attacks):
    answer = 0
    max_time = max(map(lambda x:x[0], attacks))
    
    max_health = health
    
    attack_list = [0] * (max_time+1)
    
    count = 0
    
    for i in range(len(attacks)):
        attack_list[attacks[i][0]] = attacks[i][1]

    for i in range(1,(max_time+1)):
        ## 체력이 최대체력과 같고, 공격이 없으면 회복을 할필요없음으로 패스
        if health == max_health and attack_list[i] == 0:
            # print(health)
            continue
        ## 체력이 0 미만이면 게임 끝
        if health <= 0:
            # print(health)
            answer = -1
            break
        if attack_list[i] != 0:
            health = health - attack_list[i]
            count = 0
            # print(health)
        elif health != max_health and attack_list[i] == 0:
            count += 1
            health += bandage[1]
            if health >= max_health:
                health = max_health
            elif count == bandage[0]:
                health += bandage[2]
                count = 0
            # print(health)
            
    if health <= 0:
        answer = -1
    else:
        answer = health
    return answer

