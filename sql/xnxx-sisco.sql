create table s_all_holiday
(
    id           varchar(36) not null
        primary key,
    title        varchar(36) null,
    holiday_date datetime    null
);


create table s_assign_record
(
    assign_id             varchar(36)   not null comment '指派id'
        primary key,
    task_id               varchar(36)   not null comment '任务id',
    project_id            varchar(36)   null comment '项目id',
    staff_id              varchar(36)   null comment '任务负责人id',
    assign_staff_id       varchar(36)   null comment '指派给',
    task_status           varchar(36)   null comment '任务状态',
    assign_time           datetime      null comment '指派时间',
    remark                varchar(4000) null comment '备注',
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人'
)
    comment '指派记录';

create table s_case_dynamics
(
    cd_id                  varchar(36)  not null
        primary key,
    cd_name                varchar(256) null,
    cd_time                datetime     null,
    cd_content             longtext     null,
    cd_type                int          null,
    cd_remake              mediumtext   null,
    cd_attachment_path     varchar(512) null,
    cd_attachment_name     varchar(256) null,
    cd_label               varchar(36)  null,
    cd_project_profile     varchar(512) null,
    cd_official_website    varchar(512) null,
    cd_version_information varchar(512) null,
    cd_channeli_type       int          not null
)
    comment '成功案例和资讯动态';

create table s_client
(
    client_id             varchar(36)  not null
        primary key,
    company_name          varchar(128) null,
    company_code          varchar(64)  null,
    tel                   varchar(32)  null,
    linkman               varchar(64)  null,
    business_principal    varchar(64)  null,
    technical_principal   varchar(64)  null,
    signing_date          datetime     null comment '时间',
    is_use                int          null,
    create_date           datetime     null comment '时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本'
)
    comment '客户管理';

create table s_invoice
(
    id                    varchar(36)                 not null
        primary key,
    project_id            varchar(36)                 null comment '项目id',
    invoice_code          varchar(255)                null comment '发票代码',
    invoice_number        varchar(255)                null comment '发票号码',
    check_code            varchar(255)                null comment '发票校验码',
    invoice_num           decimal(15, 2) default 0.00 not null comment '发票金额(元)',
    invoice_time          datetime                    not null comment '发票时间',
    remark                varchar(1024)               null comment '备注',
    create_date           datetime                    null comment '创建时间',
    create_user_code      varchar(36)                 null comment '创建人',
    last_modify_date      datetime                    null comment '最后修改时间',
    last_modify_user_code varchar(36)                 null comment '最后修改人'
) comment '项目发票记录';

create table s_league
(
    league_id   varchar(32) not null
        primary key,
    school_name varchar(32) null,
    school_code varchar(32) null
);

create table s_manday
(
    manday_id             varchar(36)                  not null comment 'id'
        primary key,
    year                  int(4)                       null comment '年份',
    month                 int(2)                       null comment '月份',
    manday                decimal(10, 2) default 21.75 null comment '月标准工时（天）',
    remark                varchar(4000)                null comment '备注',
    create_date           datetime                     null comment '创建时间',
    create_user_code      varchar(36)                  null comment '创建人',
    last_modify_date      datetime                     null comment '最后修改时间',
    last_modify_user_code varchar(36)                  null comment '最后修改人',
    mid_wage              decimal(10, 2) default 0.00  null comment '中级的工资标准',
    manage_ratio          decimal(10, 2) default 0.00  null comment '管理系数'
)
    comment '月标准工时表';

create table s_pay_back
(
    id                    varchar(36)   not null
        primary key,
    project_id            varchar(36)   null comment '项目id',
    back_code             varchar(255)  null comment '款项名称(存数据字典的code)',
    invoice_num           double        null comment '发票金额',
    invoice_time          datetime      null comment '发票时间',
    back_num              double        null comment '回款金额',
    back_type             varchar(255)  null comment '回款类型',
    back_time             datetime      null comment '回款日期',
    attribution           varchar(255)  null comment '归属',
    remark                varchar(1024) null comment '备注',
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人'
);

create table s_project
(
    project_id       varchar(36)                 not null
        primary key,
    client_id        varchar(36)                 null,
    project_name     varchar(128)                null,
    is_use           int(1)                      null,
    finish_time      datetime                    null,
    start_time       datetime                    null,
    project_log      mediumtext                  null,
    acceptance       datetime                    null,
    warranty_period  datetime                    null comment '质保期',
    attachment_path  varchar(255)                null comment '附件',
    attachment_name  varchar(255)                null comment '附件名称',
    project_status   varchar(255)                null comment '项目状态',
    already_pay_back double                      null comment '已回款',
    not_pay_back     double                      null comment '未回款',
    bad_debt         double         default 0    null comment '坏账',
    plan_mandays     decimal(10, 2) default 0.00 null comment '评估工期(人日)'
)
    comment '项目管理';

create table s_project_attributes
(
    data_id    varchar(36)   not null
        primary key,
    date_key   varchar(64)   null,
    value_name varchar(128)  null,
    html       varchar(2048) null,
    is_use     bit           null comment '是否使用',
    is_delete  bit           null comment '是否删除'
)
    comment '项目属性表';

create table s_project_data
(
    data_id    varchar(36) not null
        primary key,
    project_id varchar(36) null,
    data_key   varchar(64) null,
    value      mediumtext  null
)
    comment '项目数据表';

create table s_project_finance
(
    id                    varchar(36)  not null comment '主键Id'
        primary key,
    project_id            varchar(36)  null comment '项目Id',
    user_name             varchar(36)  null comment '报销人',
    amount                double       null comment '金额',
    occur_time            datetime     null comment '发生时间',
    remark                varchar(644) null comment '备注',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    cost_type             varchar(36)  null comment '费用类别',
    staff_id              varchar(36)  null comment '报销人id',
    org_code              varchar(36)  null comment '部门code'
)
;

create table s_project_maintenance
(
    id                    varchar(36)   not null comment '主键ID'
        primary key,
    project_id            varchar(36)   null comment '项目id',
    inspection_time       datetime      null comment '巡检日期',
    maintenance_details   varchar(1024) null comment '维保详情',
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人'
);

create table s_project_stage
(
    stage_id              varchar(36)            not null
        primary key,
    project_id            varchar(36)            null,
    parent_type_id        varchar(36)            null,
    type_id               varchar(36)            null,
    plan_task_time        double(11, 2)          null,
    actual_task_time      double(11, 2)          null,
    used_task_time        double(11, 2)          null,
    schedule              double(11, 2)          null,
    delay                 double(11, 2) unsigned null,
    state                 int(1)                 null,
    create_date           datetime               null comment '时间',
    create_user_code      varchar(36)            null comment '创建人',
    last_modify_date      datetime               null comment '最后修改时间',
    last_modify_user_code varchar(36)            null comment '最后修改人',
    version_id            int                    null comment '版本',
    execution_context     mediumtext             null,
    stage_name            varchar(32)            null,
    begin_date            datetime               null,
    end_date              datetime               null,
    is_sort               varchar(16)            null
)
    comment '项目阶段管理';

create table s_project_stage_copy
(
    stage_id              varchar(36)            not null
        primary key,
    project_id            varchar(36)            null,
    parent_type_id        varchar(36)            null,
    type_id               varchar(36)            null,
    plan_task_time        double(11, 2)          null,
    actual_task_time      double(11, 2)          null,
    used_task_time        double(11, 2)          null,
    schedule              double(11, 2)          null,
    delay                 double(11, 2) unsigned null,
    state                 int(1)                 null,
    create_date           datetime               null comment '时间',
    create_user_code      varchar(36)            null comment '创建人',
    last_modify_date      datetime               null comment '最后修改时间',
    last_modify_user_code varchar(36)            null comment '最后修改人',
    version_id            int                    null comment '版本',
    execution_context     mediumtext             null,
    stage_name            varchar(32)            null,
    begin_date            datetime               null,
    end_date              datetime               null
)
    comment '项目阶段管理';

create table s_project_stage_type
(
    stage_type_id         varchar(36)   not null
        primary key,
    parent_id             varchar(36)   null,
    stage_name            varchar(16)   null,
    is_use                int           null,
    user                  varchar(2048) null,
    role                  varchar(36)   null,
    order_by              int           null,
    create_date           datetime      null comment '时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人',
    version_id            int           null comment '版本'
)
    comment '项目阶段类型';

create table s_salary
(
    salary_id                 varchar(36)                 not null comment 'id'
        primary key,
    project_id                varchar(36)                 null comment '项目id',
    staff_id                  varchar(36)                 null comment '人员id',
    year                      int(4)                      null comment '年份',
    month                     int(2)                      null comment '月份',
    standard_manday           decimal(10, 2) default 0.00 null comment '月标准工时（天）',
    cost_manday               decimal(10, 2) default 0.00 null comment '月投入工时（天）',
    salary                    decimal(10, 2) default 0.00 null comment '月工资（元）',
    social_insurance          decimal(10, 2) default 0.00 null comment '社保（元）',
    housing_fund              decimal(10, 2) default 0.00 null comment '住房公积金（元）',
    subsidy                   decimal(10, 2) default 0.00 null comment '其他补贴（元）',
    manage_ratio              decimal(4, 2)               null comment '管理系数',
    month_cost                decimal(10, 2) default 0.00 null comment '月工时成本（元）',
    managerial_cost           decimal(10, 2)              null comment '月管理成本（元）',
    flow_type                 char           default '0'  null comment '流转类型（
0未流转，
1一号流转，
2二号流转
3一号二号流转
4流转修改（一号，二号）
5一号未流转，
6二号未流转
）',
    flow_direction            varchar(36)                 null comment '流转方向(人工)',
    managerial_flow_direction varchar(36)                 null comment '流转方向(管理)',
    remark                    varchar(4000)               null comment '备注',
    create_date               datetime                    null comment '创建时间',
    create_user_code          varchar(36)                 null comment '创建人',
    last_modify_date          datetime                    null comment '最后修改时间',
    last_modify_user_code     varchar(36)                 null comment '最后修改人'
)
    comment '工资管理表';

create table s_staff
(
    staff_id              varchar(36)                 not null
        primary key,
    staff_name            varchar(36)                 null,
    sex                   int                         null,
    staff_code            varchar(64)                 null,
    user_login            varchar(64)                 null,
    position              varchar(32)                 null,
    position_level        varchar(32)                 null,
    tel                   varchar(32)                 null,
    date_of_birth         datetime                    null,
    entry_time            datetime                    null,
    phone                 varchar(32)                 null,
    email                 varchar(64)                 null,
    is_use                int                         null,
    is_full               int                         null,
    org_code              varchar(36)                 null,
    org_path              varchar(2048)               null comment '组织代码全路径/',
    create_date           datetime                    null comment '时间',
    create_user_code      varchar(36)                 null comment '创建人',
    last_modify_date      datetime                    null comment '最后修改时间',
    last_modify_user_code varchar(36)                 null comment '最后修改人',
    version_id            int                         null comment '版本',
    salary                decimal(10, 2) default 0.00 null comment '月工资（元）',
    social_insurance      decimal(10, 2) default 0.00 null comment '社保（元）',
    housing_fund          decimal(10, 2) default 0.00 null comment '住房公积金（元）',
    subsidy               decimal(10, 2) default 0.00 null comment '其他补贴（元）'
)
    comment '员工管理';

create table s_stage_staff
(
    stage_staff_id        varchar(36) not null
        primary key,
    project_id            varchar(36) null,
    staff_id              varchar(36) null,
    create_date           datetime    null comment '时间',
    create_user_code      varchar(36) null comment '创建人',
    last_modify_date      datetime    null comment '最后修改时间',
    last_modify_user_code varchar(36) null comment '最后修改人',
    version_id            int         null comment '版本'
)
    comment '阶段人员管理';

create table s_task
(
    task_id               varchar(36)    not null
        primary key,
    stage_id              varchar(36)    null,
    staff_id              varchar(36)    null,
    project_id            varchar(36)    null,
    task_name             varchar(128)   null,
    task_code             varchar(64)    null,
    task_stage            varchar(36)    null,
    plan_start            datetime       null comment '时间',
    plan_end              datetime       null comment '时间',
    complete_time         datetime       null comment '时间',
    tast_type             int            null,
    work_hours            double(11, 2)  null,
    schedule              double(11, 2)  null,
    deviation_value       double(11, 0)  null,
    create_date           datetime       null comment '时间',
    create_user_code      varchar(36)    null comment '创建人',
    last_modify_date      datetime       null comment '最后修改时间',
    last_modify_user_code varchar(36)    null comment '最后修改人',
    version_id            int            null comment '版本',
    task_describe         mediumtext     null,
    task_state            int(1)         null,
    task_evaluate         mediumtext     null,
    task_difficulty       varchar(2)     null,
    total_score           double(11, 0)  null,
    progress_score        double(11, 0)  null,
    quality_score         double(11, 0)  null,
    zentao_code           varchar(36)    null comment '禅道bug编号',
    actual_start          datetime       null comment '实际开始时间',
    actual_end            datetime       null comment '实际结束时间',
    actual_hours          double(11, 2)  null comment '实际工时',
    assign_staff_id       varchar(36)    null comment '指派给',
    task_status           varchar(36)    null comment '任务状态',
    assign_time           datetime       null comment '指派时间',
    remark                varchar(10000) null comment '备注'
)
    comment '任务管理';

create definer = root@`%` trigger triTaskDeleteAfter
    after delete
    on s_task
    for each row
begin
    UPDATE s_project_stage r1,
        (select t1.stage_id,
                sum(t1.work_hours)                       as actual_task_time,
                t2.actual_task_time                      as used_task_time,
                t2.actual_task_time / sum(t1.work_hours) as `schedule`,
                IFNULL(sum(t1.deviation_value), 0)       as delay
         from s_task t1
                  LEFT JOIN (select stage_id, IFNULL(sum(work_hours), 0) as actual_task_time, task_state
                             from s_task
                             where stage_id = old.stage_id
                               and `schedule` = 100) t2 on t2.stage_id = t1.stage_id
         where t1.stage_id = old.stage_id
         group by t1.stage_id, actual_task_time) r2
    set r1.actual_task_time=r2.actual_task_time,
        r1.schedule=r2.schedule,
        r1.delay=r2.delay,
        r1.used_task_time=r2.used_task_time
    where r1.stage_id = old.stage_id;
end;

create definer = root@`%` trigger triTaskInsertAfter
    after insert
    on s_task
    for each row
begin
    UPDATE s_project_stage r1,
        (select t1.stage_id,
                sum(t1.work_hours)                       as actual_task_time,
                t2.actual_task_time                      as used_task_time,
                t2.actual_task_time / sum(t1.work_hours) as `schedule`,
                IFNULL(sum(t1.deviation_value), 0)       as delay
         from s_task t1
                  LEFT JOIN (select stage_id, IFNULL(sum(work_hours), 0) as actual_task_time, task_state
                             from s_task
                             where stage_id = new.stage_id
                               and `schedule` = 100) t2 on t1.stage_id = t2.stage_id
         where t2.stage_id = new.stage_id
         group by t1.stage_id, actual_task_time) r2
    set r1.actual_task_time=r2.actual_task_time,
        r1.schedule=r2.schedule,
        r1.delay=r2.delay,
        r1.used_task_time=r2.used_task_time
    where r1.stage_id = new.stage_id;
end;

create definer = root@`%` trigger triTaskUpdateAfter
    after update
    on s_task
    for each row
begin
    UPDATE s_project_stage r1,
        (select t1.stage_id,
                sum(t1.work_hours)                       as actual_task_time,
                t2.actual_task_time                      as used_task_time,
                t2.actual_task_time / sum(t1.work_hours) as `schedule`,
                IFNULL(sum(t1.deviation_value), 0)       as delay
         from s_task t1
                  LEFT JOIN (select stage_id, IFNULL(sum(work_hours), 0) as actual_task_time, task_state
                             from s_task
                             where stage_id = new.stage_id
                               and `schedule` = 100) t2 on t2.stage_id = t1.stage_id
         where t1.stage_id = new.stage_id
         group by t1.stage_id, actual_task_time) r2
    set r1.actual_task_time=r2.actual_task_time,
        r1.schedule=r2.schedule,
        r1.delay=r2.delay,
        r1.used_task_time=r2.used_task_time
    where r1.stage_id = new.stage_id;
end;

create table s_task_log
(
    log_id      varchar(36)   not null
        primary key,
    task_id     varchar(36)   not null,
    user_id     varchar(36)   null,
    type        varchar(64)   null,
    operation   varchar(1000) null,
    create_date datetime      null comment '时间',
    remark      varchar(500)  null
)
    comment '任务log';

create table s_task_time
(
    task_time_id          varchar(36)   not null
        primary key,
    staff_id              varchar(36)   null,
    task_time_type        varchar(64)   null,
    work_hours            double(20, 2) null,
    transaction_describe  varchar(2048) null,
    is_use                int           null,
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人',
    version_id            int           null comment '版本'
)
    comment '工时管理';

create table s_work_report
(
    report_id    varchar(36)    not null comment '工作报告id'
        primary key,
    project_id   varchar(36)    null comment '项目id',
    report_date  datetime       null comment '填报日期',
    report_year  int(4)         null comment '填报年份',
    report_month int(2)         null comment '填报月份',
    staff_id     varchar(36)    null comment '填报人id',
    org_id       varchar(36)    null comment '部门',
    man_hour     decimal(10, 2) null comment '花费工时（小时）',
    finished     varchar(4000)  null comment '已完成的工作',
    unfinished   varchar(4000)  null comment '未完成的工作',
    concert      varchar(8000)  null comment '需要协调的工作',
    post         varchar(36)    null
)
    comment '工作日报';

create table sisco_cms_channel
(
    channel_id            varchar(36)  not null
        primary key,
    channel_parent_id     varchar(36)  null comment '上级编号',
    channel_path          varchar(512) null comment '栏目全路径',
    site_id               varchar(36)  null comment '站点编号',
    channel_name          varchar(64)  null comment '栏目名称',
    channel_url           varchar(512) null comment '访问地址',
    channel_is_use        tinyint(1)   null comment '是否使用',
    remark                varchar(512) null comment '备注',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null
)
;

create table sisco_cms_content
(
    id                    varchar(36)  not null
        primary key,
    channel_id            varchar(36)  null comment '栏目编号',
    title                 varchar(256) null comment '标题',
    sub_title             varchar(256) null comment '副标题',
    content               longtext     null comment '内容',
    publish_time          datetime     null comment '发布时间',
    is_publish            tinyint(1)   null comment '是否发布(默认保存)  0保存，1发布',
    click_number          int          null comment '点击量',
    attachment_path       varchar(512) null comment '附件',
    attachment_name       varchar(256) null comment '附件名称',
    spread_keyword        varchar(512) null,
    spread_description    varchar(512) null,
    spread_url            varchar(512) null,
    type                  varchar(36)  null comment '如：推荐、头条、置顶，取数据字典中的类型',
    author                varchar(64)  null,
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null
)
;

create table sisco_cms_site
(
    site_id               varchar(36)   not null
        primary key,
    site_name             varchar(64)   null comment '站点名称',
    site_title            varchar(256)  null,
    site_catalog          varchar(64)   null,
    logo_img              varchar(512)  null,
    remark                varchar(512)  null comment '备注',
    site_domain           varchar(128)  null comment '域名',
    site_manger           varchar(2048) null comment '管理者',
    site_is_use           int           null comment '是否启用',
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人',
    version_id            int           null,
    keyword               varchar(512)  null
)
;

create table sisco_cms_template
(
    template_id           varchar(36)  not null
        primary key,
    channel_id            varchar(36)  null comment '栏目编号',
    template_name         varchar(128) null comment '模版名称',
    page_name             varchar(128) null comment '页面名称',
    template_content      longtext     null comment '模版内容',
    tempalte_path         varchar(512) null comment '本地模版路径',
    template_is_use       tinyint(1)   null comment '是否使用',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null
)
;

create table sisco_sys_attachment
(
    attach_id             varchar(36)  not null
        primary key,
    attach_no             varchar(36)  null comment '附件编号',
    attach_old_name       varchar(256) null comment '旧文件名',
    attach_new_name       varchar(256) null comment '新文件名',
    attach_size           int          null comment '文件大小',
    attach_path           varchar(512) null comment '上传路径',
    attach_type           varchar(64)  null comment '文件类型',
    is_del                bit          null comment '是否删除',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本'
)
;

create table sisco_sys_dictionary
(
    dic_id                varchar(36)   not null comment '主键'
        primary key,
    dic_code              varchar(36)   null comment '数据字典编号',
    dic_parent_code       varchar(36)   null comment '数据字典父级编号',
    dic_type              varchar(36)   null comment '数据类型',
    dic_name              varchar(2048) null comment '数据字典显示名称/内容',
    dic_order_by          int           null comment '排序',
    dic_is_use            bit           null comment '是否使用',
    dic_path              varchar(2048) null comment '全路径',
    remark                mediumtext    null comment '描述',
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人',
    version_id            int           null comment '版本',
    is_Selected           bit(11)       null
)
;

create table sisco_sys_func_menu
(
    ID                    varchar(36) not null comment '主键'
        primary key,
    func_code             varchar(36) null comment '功能编号',
    menu_code             varchar(36) null comment '菜单编号',
    role_is_use           bit         null comment '是否使用',
    role_order_by         int         null comment '排序号',
    create_date           datetime    null comment '创建时间',
    create_user_code      varchar(36) null comment '创建人',
    last_modify_date      datetime    null comment '最后修改时间',
    last_modify_user_code varchar(36) null comment '最后修改人',
    version_id            int         null comment '版本'
)
;

create table sisco_sys_function
(
    ID                    varchar(36)  not null comment '主键'
        primary key,
    func_code             varchar(36)  null comment '功能编号',
    func_name             varchar(128) null comment '功能名称',
    remark                mediumtext   null comment '描述',
    role_order_by         int          null comment '排序号',
    role_is_use           bit          null comment '是否使用',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本'
)
;

create table sisco_sys_log
(
    log_id                varchar(36)   not null
        primary key,
    log_type              varchar(36)   null comment '日志类型',
    log_info              varchar(1024) null comment '操作说明',
    log_op_type           varchar(36)   null comment '操作类型',
    remark                mediumtext    null comment '描述',
    order_by              int           null comment '排序号',
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人',
    version_id            int           null comment '版本'
)
;

create table sisco_sys_menu
(
    menu_id               varchar(36)  not null comment '主键'
        primary key,
    menu_code             varchar(36)  null comment '菜单编号',
    menu_parent_code      varchar(36)  null comment '父级菜单编号',
    menu_name             varchar(64)  null comment '菜单名称',
    menu_icon             varchar(128) null comment '菜单icon图',
    role_business_type    varchar(36)  null comment '所属业务(数据字典维护code)',
    menu_path             varchar(512) null comment '菜单全路径',
    menu_level            int          null comment '菜单深度(1为一级菜单,以此类推)',
    menu_link_address     varchar(128) null comment '菜单链接',
    menu_is_use           bit          null comment '是否使用',
    menu_is_leaf          bit          null comment '是否是末级(1,是 0,否)',
    menu_is_report        bit          null comment '是否为列表菜单，用于设置表头',
    menu_order_by         int          null comment '排序号',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本',
    menu_type             varchar(36)  null comment '菜单类型'
)
;

create table sisco_sys_menu_btn
(
    btn_id                varchar(36)  not null comment '主键'
        primary key,
    btn_code              varchar(36)  null comment '按钮编号',
    btn_name              varchar(64)  null comment '按钮名称',
    btn_menu_code         varchar(36)  null comment '所属菜单编号',
    btn_link_address      varchar(128) null comment '按钮链接',
    btn_type              varchar(36)  null,
    btn_class             varchar(128) null,
    btn_icon_class        varchar(128) null,
    btn_js_function       varchar(128) null,
    btn_is_use            bit          null comment '是否使用',
    btn_order_by          int          null comment '排序号',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本'
)
;

create table sisco_sys_organizational
(
    org_id                varchar(36)   not null comment '主键'
        primary key,
    org_code              varchar(36)   null comment '组织代码',
    parent_code           varchar(36)   null comment '上级组织代码',
    org_name              varchar(36)   null comment '组织名称',
    org_createDate        datetime      null comment '部门成立时间',
    org_path              varchar(2048) null comment '组织代码全路径/',
    org_path_name         varchar(2048) null comment '组织名称全路径/',
    org_order_by          int           null comment '排序号',
    org_level             int           null comment '树深度',
    org_is_use            bit           null comment '是否使用',
    create_date           datetime      null comment '创建时间',
    create_user_code      varchar(36)   null comment '创建人',
    last_modify_date      datetime      null comment '最后修改时间',
    last_modify_user_code varchar(36)   null comment '最后修改人',
    version_id            int           null comment '版本',
    img_path              varchar(256)  null
);

create table sisco_sys_role
(
    role_id               varchar(36) not null comment '角色Id'
        primary key,
    role_code             varchar(36) null comment '角色编号',
    role_name             varchar(64) null comment '角色名称',
    role_business_type    varchar(36) null comment '所属业务(数据字典维护code)',
    role_order_by         int         null comment '排序号',
    role_is_use           bit         null comment '是否使用',
    create_date           datetime    null comment '创建时间',
    create_user_code      varchar(36) null comment '创建人',
    last_modify_date      datetime    null comment '最后修改时间',
    last_modify_user_code varchar(36) null comment '最后修改人',
    version_id            int         null comment '版本'
)
;

create table sisco_sys_role_user_ref
(
    ID                    varchar(36) not null
        primary key,
    user_code             varchar(36) null comment '用户',
    role_code             varchar(36) null comment '角色',
    create_date           datetime    null comment '创建时间',
    create_user_code      varchar(36) null comment '创建人',
    last_modify_date      datetime    null comment '最后修改时间',
    last_modify_user_code varchar(36) null comment '最后修改人',
    version_id            int         null comment '版本'
)
;

create table sisco_sys_tables
(
    table_id              varchar(36)  not null
        primary key,
    table_code            varchar(256) null comment '表名',
    table_name            varchar(512) null comment '表中文名',
    table_type            varchar(36)  null comment '表类型',
    is_del                bit          null comment '是否删除',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本'
)
;

create table sisco_sys_tables_columns
(
    columns_id            varchar(36)  not null
        primary key,
    table_code            varchar(256) null comment '表名',
    columns_name          varchar(512) null comment '列中文名',
    columns_code          varchar(256) null comment '列名',
    columns_type          varchar(36)  null comment '类型',
    columns_length        int          null comment '长度',
    columns_precision     int          null comment '精度',
    columns_comment       mediumtext   null comment '备注',
    is_primary_key        bit          null comment '是否主键',
    is_del                bit          null comment '是否删除',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本'
)
;

create table sisco_sys_user
(
    user_id               varchar(36)  not null comment '主键'
        primary key,
    user_code             varchar(36)  null comment '用户编号',
    user_name             varchar(36)  null comment '用户名称',
    user_login_name       varchar(36)  null comment '登录名(可为手机号)',
    user_pwd              varchar(36)  null comment '用户密码',
    user_face_name        varchar(256) null comment '用户头像',
    user_sex              bit          null comment '性别(1为男0为女)',
    user_phone            varchar(36)  null comment '手机号',
    user_email            varchar(128) null comment '电子邮箱',
    user_org_code         varchar(36)  null comment '所属组织code',
    is_supper             bit          null comment '是否超级管理员',
    remark                mediumtext   null,
    token_key             varchar(36)  null comment '会话key',
    user_is_use           bit          null comment '是否使用',
    create_date           datetime     null comment '创建时间',
    create_user_code      varchar(36)  null comment '创建人',
    last_modify_date      datetime     null comment '最后修改时间',
    last_modify_user_code varchar(36)  null comment '最后修改人',
    version_id            int          null comment '版本',
    last_login_date       datetime     null comment '最后修改时间',
    continuity_fial_count int          null comment '连接失败次数',
    is_lock               bit          null comment '是否锁定',
    is_leader_in_dept     int(1)       null comment '是否部门领导',
    position_name         varchar(36)  null comment '岗位名称'
)
;

create table sisco_sys_user_role_menu
(
    auth_id               varchar(36) not null comment '权限Id'
        primary key,
    role_code             varchar(36) null comment '角色编号',
    user_code             varchar(36) null comment '用户编号',
    btn_code              varchar(36) null comment '按钮编号',
    menu_code             varchar(36) null comment '菜单编号',
    is_use                bit         null comment '是否使用',
    create_date           datetime    null comment '创建时间',
    create_user_code      varchar(36) null comment '创建人',
    last_modify_date      datetime    null comment '最后修改时间',
    last_modify_user_code varchar(36) null comment '最后修改人',
    version_id            int         null comment '版本'
)
;

create table visiting_record
(
    id                   varchar(36)  not null
        primary key,
    visit_object         varchar(255) null,
    phone                varchar(36)  null,
    visit_address        varchar(255) null,
    visit_object_feature varchar(255) null,
    visiting_record      varchar(255) null,
    visiting_time        datetime     null,
    project_id           varchar(36)  not null
)
;

