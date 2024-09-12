create table if not exists pc_equities_market_group(
equities_market_code Integer not null,
frtb_effective Integer null,
frtb_effective_date varchar(255) null,
frtb_equities_market_desc varchar(255) null,
frtb_equities_market_short_desc varchar(255) null,
frtb_decimal_positions Integer null,
frtb_equities_market_symbol varchar(255) null,
frtb_equities_market_scale varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint pc_equities_market_group_pk primary key(equities_market_code));