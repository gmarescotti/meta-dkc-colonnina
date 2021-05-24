
SUMMARY = "Extensions for Django"
HOMEPAGE = "http://github.com/django-extensions/django-extensions"
AUTHOR = "Michael Trier <mtrier@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4e2ea55ada3b855e366cf49eea33166"

SRC_URI = "https://files.pythonhosted.org/packages/fc/40/22ff745aea0468dcefba8b165d010e5260d3058862ea280c2ce5212c8560/django-extensions-3.1.3.tar.gz"
SRC_URI[md5sum] = "384fafbed9f8760408c0f0a3909fd7da"
SRC_URI[sha256sum] = "5f0fea7bf131ca303090352577a9e7f8bfbf5489bd9d9c8aea9401db28db34a0"

S = "${WORKDIR}/django-extensions-3.1.3"

RDEPENDS_${PN} = "python3-django"

inherit setuptools3
