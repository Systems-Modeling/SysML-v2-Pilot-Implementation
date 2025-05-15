from dataclasses import dataclass

@dataclass
class ReferenceSource:
    id: str
    title: str
    short_name: str
    publication_year: int
    uri: str
